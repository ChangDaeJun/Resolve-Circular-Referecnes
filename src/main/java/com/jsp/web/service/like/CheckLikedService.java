package com.jsp.web.service.like;

import com.jsp.biz.like.LikeDAO;
import com.jsp.biz.like.LikeVO;

public class CheckLikedService {
    private CheckLikedService(){}
    private static class CheckLikedServiceHelper{
        private static final CheckLikedService INSTANCE = new CheckLikedService();
    }
    public static CheckLikedService getInstance(){
        return CheckLikedService.CheckLikedServiceHelper.INSTANCE;
    }

    public LikeVO run(LikeVO vo){
        LikeDAO likeDAO = new LikeDAO();
        LikeVO like = likeDAO.findByUserIdAndBoardId(vo);
    }
}
