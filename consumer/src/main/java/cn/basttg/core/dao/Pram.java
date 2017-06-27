/**
 * Copyright 2016 © YaoWan.com Corp. All Rights Reserverd.
 * <p>
 * 广州要玩娱乐网络技术有限公司    http://www.yaowan.com
 * <p>
 * Create Date : 2017/4/15 0015
 **/
package cn.basttg.core.dao;

import java.io.Serializable;

/**
 *
 * @author <a href="mailto:lijianchao@yaowan.com">李建超</a>
 *
 */
public class Pram implements Serializable {

	public String name;

	public int id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
