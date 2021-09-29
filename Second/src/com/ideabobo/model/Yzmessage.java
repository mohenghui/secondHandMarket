package com.ideabobo.model;

/**
 * User entity. @author MyEclipse Persistence Tools
 */

public class Yzmessage implements java.io.Serializable {

	// Fields
    private Integer id;
    private Integer fid;
    private Integer tid;
    private String status;
    private String fuser;
    private String img;
    private String ndate;
    
    
	public String getNdate() {
		return ndate;
	}
	public void setNdate(String ndate) {
		this.ndate = ndate;
	}
	public String getFuser() {
		return fuser;
	}
	public void setFuser(String fuser) {
		this.fuser = fuser;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getFid() {
		return fid;
	}
	public void setFid(Integer fid) {
		this.fid = fid;
	}
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
    
}