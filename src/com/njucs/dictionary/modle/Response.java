package com.njucs.dictionary.modle;

import java.io.Serializable;

/**
 * 服务器端发送的响应类
 * 登录：
 * 		登陆成功			100
 * 		用户名不存在		101
 * 		密码错误			102
 * 登出：					110	返回编号和空的description
 * 注册：
 * 		注册成功			200
 * 		用户名已存在		201
 * 		邮箱已被使用		202
 * 查找：
 * 		获取单词点赞数	300	返回编号和一个Like对象
 * 		更新点赞数：		
 * 					点赞		301	返回编号和一个空的description
 * 					取消赞	302	返回编号和一个空的description
 * 获取用户列表			310	返回编号和UserTable类
 * 发送分享单词列表		311	返回编号和空的描述字符串
 * 获取分享单词列表		312	返回编号和SharedWord类（返回String数组长度为2，不包括ToID，0为FromID，1为word）
 */
public class Response implements Serializable{
	private static final long serialVersionUID = 2922287507014280279L;
	private int no;
	private String description;
	private Like like;
	private UserTable usertable;
	private SharedWord sharedword;
	
	// 搜索单词返回编号和单词各网站翻译的点赞数
	public Response(int no, Like like){
		this.no=no;
		this.like=like;
	}
	
	// 登录注册返回编号和错误描述
	public Response(int no, String description){
		this.no=no;
		this.description=description;
	}
	
	public Response(int no, UserTable usertable){
		this.no=no;
		this.usertable=usertable;
	}
	
	public Response(int no, SharedWord sharedword){
		this.no=no;
		this.sharedword=sharedword;
	}
	
	public int getNo() {
		return no;
	}
	
	public String getDescription() {
		return description;
	}

	public Like getLike() {
		return like;
	}

	public UserTable getUsertable() {
		return usertable;
	}
	
	public void setUsertable(UserTable usertable){
		this.usertable=usertable;
	}

	public SharedWord getSharedword() {
		return sharedword;
	}

	public void setSharedword(SharedWord sharedword) {
		this.sharedword = sharedword;
	}

}
