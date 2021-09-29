package com.ideabobo.action;


import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.swing.*;

import org.springframework.stereotype.Controller;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.ideabobo.model.Bill;
import com.ideabobo.model.Dingzuo;
import com.ideabobo.model.Good;
import com.ideabobo.model.Message;
import com.ideabobo.model.Posts;
import com.ideabobo.model.Replay;
import com.ideabobo.model.User;
import com.ideabobo.model.Yzmessage;
import com.ideabobo.service.BaseService;
import com.ideabobo.service.BillService;
import com.ideabobo.service.DingzuoService;
import com.ideabobo.service.GoodService;
import com.ideabobo.service.PostsService;
import com.ideabobo.service.ReplayService;
import com.ideabobo.service.ShopService;
import com.ideabobo.service.TypeService;
import com.ideabobo.service.UserService;
import com.ideabobo.util.GetNowTime;
import com.ideabobo.util.IdeaAction;

@Controller
public class WehallAction extends IdeaAction {
	@Resource
    private BaseService baseService;
    @Resource
    private BillService billService;
    @Resource
    private ShopService shopService;
    @Resource
    private GoodService goodService;
    @Resource
    private DingzuoService dingzuoService;
    @Resource
    private TypeService typeService;
    @Resource
    private UserService userService;
    @Resource
    private PostsService postsService;
    @Resource
    private ReplayService replayService;
    public Gson gson = new Gson();
    private static final long serialVersionUID = -3218238026025256103L;

    public String wehall(){
//		String openid = request.getParameter("openid");
//		session.put("openid", openid);
        return SUCCESS;
    }

    public void login(){
        String username = request.getParameter("username");
        String passwd = request.getParameter("passwd");
        User user = new User();
        user.setPasswd(passwd);
        user.setUsername(encodeGet(username));
        User r = userService.find(user);
        if(r!=null){
            renderJsonpObj(r);
        }else{
            renderJsonpString("fail");
        }
    }

    public void checkUser(){
        User u = new User();
        String username = request.getParameter("username");
        u.setUsername(username);
        User r = userService.find(u);
        if(r!=null){
            renderJsonpString("fail");
        }else{
            renderJsonpString("success");
        }
    }

    public void updateUser(){
        String tel = request.getParameter("tel");
        String qq = request.getParameter("qq");
        String wechat = request.getParameter("wechat");
        String email = request.getParameter("email");
        String birth = request.getParameter("birth");
        String sex = request.getParameter("sex");
        String id = request.getParameter("id");
        String address = request.getParameter("address");

        User user = userService.find(id);

        user.setId(Integer.parseInt(id));
        user.setTel(tel);
        user.setWechat(wechat);
        user.setQq(qq);
        user.setEmail(email);
        user.setBirth(birth);
        user.setSex(encodeGet(sex));
        user.setAddress(encodeGet(address));

        userService.update(user);
        renderJsonpString("success");
    }

    public void changePasswd(){
        String passwd = request.getParameter("passwd");
        String id = request.getParameter("id");
        User user = userService.find(id);
        user.setPasswd(passwd);
        userService.update(user);
        renderJsonpString("success");
    }

    public void register(){
    	User user = (User) getByRequest(new User(), true);
        String roletype = "2";
        user.setRoletype(roletype);
        userService.save(user);
        renderJsonpString("success");
    }

    public void listShop(){
        renderJsonpObj(shopService.list());
    }
    public void listGood(){
        String type = request.getParameter("stype");
        String sid = request.getParameter("sid");
        String uid = request.getParameter("uid");
        String statecn = request.getParameter("statecn");
        Good g = new Good();
        if (type != null&& !"".equals(type)) {
            g.setTypeid(type);

        }
        if(sid != null&& !"".equals(sid)){
            g.setSid(sid);
        }
        if(uid != null&& !"".equals(uid)){
            g.setUid(uid);
        }
        if(statecn != null&& !"".equals(statecn)){
            statecn = encodeGet(statecn);
            g.setStatecn(statecn);
        }
        renderJsonpObj(goodService.list(g));
    }

    public void listType(){
        renderJsonpObj(typeService.list());
    }

    public void saveDingzuo(){
        Dingzuo dz = new Dingzuo();
        dz.setRenshu(request.getParameter("renshu"));
        dz.setXingming(encodeGet(request.getParameter("xingming")));
        dz.setShouji(request.getParameter("shouji"));
        dz.setShijian(request.getParameter("shijian"));
        dz.setTodate(request.getParameter("todate"));
        dz.setBeizhu(encodeGet(request.getParameter("beizhu")));
        dz.setShopid(request.getParameter("shopid"));
        dz.setShopname(encodeGet(request.getParameter("shopname")));
        dz.setOpenid(request.getParameter("openid"));
        dz.setNdate(GetNowTime.getNowTimeNian());
        dingzuoService.save(dz);
        renderJsonpString("提交成功!");
    }

    public void saveBill(){
        Bill bill = (Bill) getByRequest(new Bill(), true);

        bill.setNdate(GetNowTime.getNowTimeNian());
   

        bill.setStatecn("未付款");
        billService.save(bill);
        renderJsonpString("提交成功!");

    }
    
    public void updateGoodStatecn(){
    	String id = request.getParameter("id");
    	Good g = (Good) baseService.find(Integer.parseInt(id), Good.class);
    	String statecn = request.getParameter("statecn");
    	statecn = encodeGet(statecn);
    	g.setStatecn(statecn);
    	baseService.update(g);
    	renderJsonpString("0");
    }

    public void saveBills(){
        String bills = request.getParameter("bills");
        bills = encodeGet(bills);
        JsonParser parser = new JsonParser();
        JsonArray blist = parser.parse(bills).getAsJsonArray();
        for(int i=0;i<blist.size();i++){
            JsonElement jo = blist.get(i);
            JsonObject obj = (JsonObject) parser.parse(jo.toString());
            Bill bill = new Bill();
            bill.setTotal(obj.get("total").getAsString());
            bill.setSid(obj.get("sid").getAsString());
            bill.setShop(obj.get("shop").getAsString());
            bill.setUid(obj.get("uid").getAsString());
            bill.setUser(obj.get("user").getAsString());
            bill.setNdate(GetNowTime.getNowTimeNian());
            bill.setGids(obj.get("gids").getAsString());
            bill.setGnames(obj.get("gnames").getAsString());
            bill.setAddress(obj.get("address").getAsString());
            bill.setTel(obj.get("tel").getAsString());
            bill.setNote(obj.get("note").getAsString());
            bill.setWay(obj.get("way").getAsString());

            bill.setStatecn("未付款");
            billService.save(bill);
        }

        renderJsonpString("提交成功!");
    }

    public void listBillGoods(){
    	String gids = request.getParameter("gids");
    	String hql = "from Good u where u.id in ("+gids+")";
    	renderJsonpObj(baseService.list(hql));
    }
    public void mybills(){
    	String hql = "from Bill t where 1=1";
        String uid = request.getParameter("uid");
        String sid = request.getParameter("sid");
        if(uid!=null && !uid.equals("")){
        	hql+=" and t.uid='"+uid+"'";
        }
        if(sid!=null && !sid.equals("")){
        	hql+=" and t.sid='"+sid+"'";
        }

        renderJsonpObj(baseService.list(hql));
    }
    public void myshopbills(){
        String sid = request.getParameter("sid");
        Bill b = new Bill();
        b.setSid(sid);
        renderJsonpObj(billService.list(b));
    }
    public Bill updateXiaoliang(Bill bill){
        String billstr = bill.getBill();
        JsonParser parser = new JsonParser();
        JsonArray ja = parser.parse(billstr).getAsJsonArray();
        String gnames = "";
        for(int i=0;i<ja.size();i++){
            JsonElement jo = ja.get(i);
            JsonObject obj = (JsonObject) parser.parse(jo.toString());
            String id = obj.get("id").getAsString();
            Good g = goodService.find(id);
            int count = Integer.parseInt(g.getCount());
            int bcount = Integer.parseInt(obj.get("count").getAsString());
            int total = count+bcount;
            g.setCount(total+"");
            if(i == 0){
                gnames+=obj.get("gname").getAsString();
            }else{
                gnames+=","+obj.get("gname").getAsString();
            }
            bill.setGnames(gnames);
            goodService.update(g);
        }
        return bill;
    }
    
    public void delBill(){
        String id= request.getParameter("bid");
        billService.delete(Integer.parseInt(id));
        renderJsonpString("提交成功!");

    }
    
    public void billState(){
    	String idstr = request.getParameter("id");
    	Bill b = billService.find(idstr);
    	String statecn = request.getParameter("statecn");
    	String fnote = request.getParameter("fnote");
    	if(fnote!=null && !fnote.equals("")){
    		b.setFnote(encodeGet(fnote));
    	}
    	statecn = encodeGet(statecn);
    	b.setStatecn(statecn);
    	billService.update(b);
    	renderJsonpObj(b);
    }
    
    public void paybill(){
    	String paytype = request.getParameter("paytype");
    	String idstr = request.getParameter("id");
    	Bill b = billService.find(idstr);
    	String statecn = request.getParameter("statecn");
    	statecn = encodeGet(statecn);
    	b.setStatecn(statecn);
    	billService.update(b);
    	if(paytype.equals("2")){
    		if(!jianMoney(b.getUid(), b.getTotal())){
    			renderJsonpObj(null);
    		};
    	}else{
    		jiaMoney(b.getUid(), b.getTotal());
    		renderJsonpObj(b);
    	}
    	
    	
    	
    }
    

    public void deleteGood(){
        String id = request.getParameter("id");
        goodService.delete(Integer.parseInt(id));
        renderJsonpString("success");
    }
    public void deleteBill(){
        String id = request.getParameter("id");
        billService.delete(Integer.parseInt(id));
        renderJsonpString("success");
    }
    
    public void addPosts(){
    	String uid = request.getParameter("uid");
    	String title = encodeGet(request.getParameter("title"));
    	String note = encodeGet(request.getParameter("note"));
    	String username = encodeGet(request.getParameter("username"));
    	String type = encodeGet(request.getParameter("type"));
    	String img = encodeGet(request.getParameter("img"));
    	String ndate = GetNowTime.getNowTimeEn();
    	Posts p = new Posts();
    	p.setUid(uid);
    	p.setTitle(title);
    	p.setUsername(username);
    	p.setNote(note);
    	p.setNdate(ndate);
    	p.setType(type);
    	p.setImg(img);
    	postsService.save(p);
    	renderJsonpString("success");
    }
    public void listPosts(){
        renderJsonpObj(postsService.list());
    }
    public void listReplay(){
    	String pid = request.getParameter("pid");
    	Replay r = new Replay();
    	r.setPid(pid);
        renderJsonpObj(replayService.list(r));
    }
    public void deletePosts(){
    	String id = request.getParameter("id");
    	postsService.delete(Integer.parseInt(id));    	
    	renderJsonpString("success");
    }
    public void addReplay(){
    	String uid = request.getParameter("uid");
    	String pid = request.getParameter("pid");
    	String note = encodeGet(request.getParameter("note"));
    	String username = encodeGet(request.getParameter("username"));
    	String ndate = GetNowTime.getNowTimeEn();
    	Replay m = new Replay();
    	m.setUid(uid);
    	m.setPid(pid);
    	m.setUsername(username);
    	m.setNote(note);
    	m.setNdate(ndate);
    	replayService.save(m);
    	renderJsonpString("success");
    }
    
    public void goodList(){
    	String hql = "from Good t where 1=1";
    	String uid = request.getParameter("uid");
    	if(uid!=null && !uid.equals("")){
    		hql+=" and t.uid='"+uid+"'";
    	}
    	
    	hql+=" order by t.ntime desc";
    	renderJsonpObj(baseService.list(hql));
    }
    
    public void saveGood(){
    	Good info = (Good) getByRequest(new Good(), true);
    	info.setNtime((new Date()).getTime());
    	info.setStatecn("待交易");
    	baseService.save(info);
        renderJsonpString("success");
    }
    
    public void delPosts(){
    	String id = request.getParameter("id");
    	baseService.delete(Integer.parseInt(id), Posts.class);
    	renderJsonpString("success");
    }
    
    public void addLocation(){
    	String uid = request.getParameter("uid");
    	String latitude = request.getParameter("latitude");
    	String longitude = request.getParameter("longitude");
    	User user = (User) baseService.find(Integer.parseInt(uid), User.class);
    	if(user!=null){
    		user.setLatitude(latitude);
    		user.setLongitude(longitude);
    		baseService.update(user);
    	}
    	renderJsonpString("success");
    }
    
  /*  public void listUser(){
    	renderJsonpObj(baseService.list("from User t where t.roletype='2'"));
    }
    */
    public void listNotice(){
    	renderJsonpObj(baseService.list("from Notice"));
    }
    
    public boolean jianMoney(String uid,String money){
    	User s = (User) baseService.find(Integer.parseInt(uid), User.class);
    	Integer um = s.getMoney();
    	int mi = Integer.parseInt(money);
    	if(um==null){
    		um = 0;
    	}
    	um = um-mi;
    	if(um<0){
    		return false;
    	}else{
    		s.setMoney(um);
        	baseService.update(s);
        	return true;
    	}
    	
    }
    
    public void jiaMoney(String uid,String money){
    	User s = (User) baseService.find(Integer.parseInt(uid), User.class);
    	Integer um = s.getMoney();
    	int mi = Integer.parseInt(money);
    	if(um==null){
    		um = 0;
    	}
    	um = um+mi;
    	s.setMoney(um);
    	baseService.update(s);
    }
    
    public void delGood(){
    	String id = request.getParameter("id");
    	baseService.delete(Integer.parseInt(id), Good.class);
    	renderJsonpString("0");
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /****************************************聊天相关********************************/
    /*public void listQunzu(){
    	String hql = "from Qunzu t where 1=1";
    	String type = request.getParameter("type");
    	if(type!=null && !type.equals("")){
    		type = encodeGet(type);
    		hql+=" and t.type like '%"+type+"%'";
    	}
        renderJsonpObj(baseService.list(hql));
    }
    
    
    
    public void listMyQunzu(){
    	String uid = request.getParameter("uid");
    	User u = (User) baseService.find(Integer.parseInt(uid), User.class);
    	if(u.getQids()==null || u.getQids().equals("")){
    		renderJsonpObj(null);
    	}else{
    		List<Qunzu> list = baseService.list("from Qunzu t where t.id in ("+u.getQids()+")");
        	renderJsonpObj(list);
    	}
    	
    }
    
    public void checkIsMyQunzu(){
    	String uid = request.getParameter("uid");
    	String qid = request.getParameter("qid");
    	User u = (User) baseService.find(Integer.parseInt(uid), User.class);
    	String qids = u.getQids();
    	String info = "0";
    	if(qids!=null && !qids.equals("")){
    		String[] qidsarray = qids.split(",");
        	
        	for(int i=0;i<qidsarray.length;i++){
        		if(qidsarray[i].equals(qid)){
        			info = "1";
        			break;
        		}
        	}
        	renderJsonpString(info);
    	}else{
    		renderJsonpString(info);
    	}
    	
    }
    
   
    
    public void saveQunzu(){
    	Qunzu info = (Qunzu) getByRequest(new Qunzu(), true);
    	baseService.save(info);
        renderJsonpObj(info);
    }
    
    public void delQunzu(){
    	String id = request.getParameter("id");
    	baseService.delete(Integer.parseInt(id), Qunzu.class);
    	renderJsonpString("success");
    }
    
    
    
    
    
    public void addQunzu(){
    	String uid = request.getParameter("uid");
    	String qid = request.getParameter("qid");
    	User u = (User) baseService.find(Integer.parseInt(uid), User.class);
    	String qids = u.getQids();
    	if(qids==null||qids.equals("")){
    		qids = qid;
    	}else{
    		qids+=","+qid;
    	}
    	u.setQids(qids);
    	baseService.update(u);
    	renderJsonpObj(u);
    }
 //退出群   
    public void delQunzus(){
    	String uid = request.getParameter("uid");
    	String qid = request.getParameter("qid");
    	User u = (User) baseService.find(Integer.parseInt(uid), User.class);
    	String qids = u.getQids();
    	String[] qidsarray = qids.split(",");
    	String nqids = "";
    	for(int i=0;i<qidsarray.length;i++){
    		String oid = qidsarray[i];
    		if(oid.equals(qid)){
    			continue;
    		}else{
    			if(nqids.equals("")){
    				nqids = oid;
    			}else{
    				nqids+=","+oid;
    			}
    		}
    	}
    	
    	u.setQids(nqids);
    	baseService.update(u);
    	renderJsonpObj(u);
    }*/
    
    /*******************************************好友管理*******************************/
    
    
    
    public void listMyFriend(){
    	String uid = request.getParameter("uid");
    	User u = (User) baseService.find(Integer.parseInt(uid), User.class);
    	if(u.getFids()==null || u.getFids().equals("")){
    		renderJsonpObj(null);
    	}else{
    		List<User> list = baseService.list("from User t where t.id in ("+u.getFids()+")");
        	renderJsonpObj(list);
    	}
    	
    }

    public void listUser(){
    	String roletype = request.getParameter("roletype");
    	String hql = "from User t where 1=1";
    	if(roletype!=null && !roletype.equals("")){
    		hql+=" and t.roletype='"+roletype+"'";
    	}
    	renderJsonpObj(baseService.list(hql));
    }
    
    public void checkIsMyFriend(){
    	String uid = request.getParameter("uid");
    	String fid = request.getParameter("fid");
    	User u = (User) baseService.find(Integer.parseInt(uid), User.class);
    	String fids = u.getFids();
    	String info = "0";
    	if(fids!=null && !fids.equals("")){
    		String[] fidsarray = fids.split(",");
    		for(int i=0;i<fidsarray.length;i++){
        		if(fidsarray[i].equals(fid)){
        			info = "1";
        			break;
        		}
        	}
    	}
    	
    	renderJsonpString(info);
    }
    
    public void addFriend(){
    	String uid = request.getParameter("uid");
    	String fid = request.getParameter("fid");
    	User u = (User) baseService.find(Integer.parseInt(uid), User.class);
    	String fids = u.getFids();
    	if(fids==null||fids.equals("")){
    		fids = fid;
    	}else{
    		fids+=","+fid;
    	}
    	u.setFids(fids);
    	baseService.update(u);
    	renderJsonpObj(u);
    }
    
    
    public void delFriend(){
    	String uid = request.getParameter("uid");
    	String fid = request.getParameter("fid");
    	User u = (User) baseService.find(Integer.parseInt(uid), User.class);
    	String fids = u.getFids();
    	String[] fidsarray = fids.split(",");
    	String nfids = "";
    	for(int i=0;i<fidsarray.length;i++){
    		String oid = fidsarray[i];
    		if(oid.equals(fid)){
    			continue;
    		}else{
    			if(nfids.equals("")){
    				nfids = oid;
    			}else{
    				nfids+=","+oid;
    			}
    		}
    	}
    	
    	u.setFids(nfids);
    	baseService.update(u);
    	renderJsonpObj(u);
    }
    
    public void sendAddMessage(){
    	Yzmessage msg = (Yzmessage) getByRequest(new Yzmessage(), true);
    	msg.setNdate(GetNowTime.getNowTimeEn());
    	baseService.save(msg);
    	renderJsonpString("0");
    }
    
    public void listMyAddMessage(){
 	   String uid = request.getParameter("uid");
 	   List<Message> mlist = baseService.list("from Yzmessage t where t.tid = "+uid);
 	   renderJsonpObj(mlist);
    }
    
    public void updateYzMsgStatus(){
    	String id = request.getParameter("id");
    	String status = request.getParameter("status");
    	status = encodeGet(status);
    	Yzmessage msg = (Yzmessage) baseService.find(Integer.parseInt(id), Yzmessage.class);
    	msg.setStatus(status);
    	baseService.update(msg);
    	renderJsonpString("0");
    }
    
    
    /*******************************************好友管理*******************************/
    
    public void addMessage(){
    	Message msg = (Message) getByRequest(new Message(), true);
        String ndate = GetNowTime.getNowTimeEn();
        msg.setNdate(ndate);
        baseService.save(msg);
        renderJsonpObj(msg);
    }
    
    public void addQunMessage(){
    	Message msg = (Message) getByRequest(new Message(), true);
        String ndate = GetNowTime.getNowTimeEn();
        msg.setNdate(ndate);
        msg.setZan(0);
        baseService.save(msg);
        renderJsonpObj(msg);
    }
    
    public void listQunMessage(){
    	String uid = request.getParameter("uid");
    	String qid = request.getParameter("qid");
    	List<Message> list = null;
    	if(uid!=null){
    		int id = Integer.parseInt(uid);
    		int iqid = Integer.parseInt(qid);
    		list = listAboutMeQun(id,iqid);
    	}
    	renderJsonpObj(list);
    }
    
    
    public List<Message> listAboutMeQun(int uid,int fid) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		sb.append("from Message u where 1=1");
		sb.append(" and u.qid="+fid);
	
		System.out.println(sb.toString());
		List teaList = baseService.list(sb.toString());
		return teaList;
	}
    
    public void listMyMessage(){
    	String uid = request.getParameter("uid");
    	String fid = request.getParameter("fid");
    	List<Message> list = null;
    	if(uid!=null){
    		int id = Integer.parseInt(uid);
    		int fiid = Integer.parseInt(fid);
    		list = listAboutMe(id,fiid);
    	}
    	renderJsonpObj(list);
    }
    
    public List<Message> listAboutMe(int uid,int fid) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		sb.append("from Message u where 1=1");
		sb.append(" and (u.uid="+uid+" or u.fid="+uid+") and (u.uid="+fid+" or u.fid="+fid+")");
	
		System.out.println(sb.toString());
		List teaList = baseService.list(sb.toString());
		return teaList;
	}
    
    
    public void getUser(){
    	String id = request.getParameter("id");
    	User u = (User) baseService.find(Integer.parseInt(id), User.class);
    	renderJsonpObj(u);
    }

    
    /**********************************************聊天相关结束*************************************/
}
