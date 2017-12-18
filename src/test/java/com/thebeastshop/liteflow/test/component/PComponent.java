/**
 * <p>Title: liteFlow</p>
 * <p>Description: 轻量级的组件式流程框架</p>
 * <p>Copyright: Copyright (c) 2017</p>
 * @author Bryan.Zhang
 * @email weenyc31@163.com
 * @Date 2017-8-1
 * @version 1.0
 */
package com.thebeastshop.liteflow.test.component;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.thebeastshop.liteflow.core.FlowExecutor;
import com.thebeastshop.liteflow.core.NodeCondComponent;

@Component("p")
public class PComponent extends NodeCondComponent {

	@Resource
	private FlowExecutor flowExecutor;
	
	@Override
	protected String processCond() throws Exception {
		System.out.println("p conponent executed");
		Integer flag = this.getSlot().getChainReqData("strategy2");
		if(flag == 10) {
			return "p1";
		}else {
			return "p2";
		}
		
	}
	
}
