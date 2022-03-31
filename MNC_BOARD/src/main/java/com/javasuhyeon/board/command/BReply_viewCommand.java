package com.javasuhyeon.board.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javasuhyeon.board.dao.BDao;

public class BReply_viewCommand implements BCommand {

	@Override
	public void excute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String bId = request.getParameter("bid");
		BDao dao = new BDao();
		dao.reply_view(bId);
		
		request.setAttribute("reply_view", dao);
	}

}
