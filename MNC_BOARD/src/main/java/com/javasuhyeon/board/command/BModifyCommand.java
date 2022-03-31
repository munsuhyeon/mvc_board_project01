package com.javasuhyeon.board.command;

import java.sql.Timestamp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javasuhyeon.board.dao.BDao;
import com.javasuhyeon.board.dto.BDto;

public class BModifyCommand implements BCommand {

	@Override
	public void excute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String bId = request.getParameter("bid");
		String bName = request.getParameter("bname");
		String bTitle = request.getParameter("btitle");
		String bContent = request.getParameter("bcontent");
		
		BDao dao = new BDao();
		dao.modify(bId, bName, bTitle, bContent);
	}

}
