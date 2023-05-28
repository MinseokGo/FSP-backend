package com.example.fspbackend.Service;

import com.example.fspbackend.DAO.PostDAO;
import com.example.fspbackend.DAO.ShopDAO;
import com.example.fspbackend.DTO.ViewDTO;
import com.example.fspbackend.Exception.PostNotFoundException;
import com.example.fspbackend.Model.Post;
import com.example.fspbackend.Model.Shop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ViewPostService {
    @Autowired
    private PostDAO postDAO;
    /*@Autowired
    private ShopDAO shopDAO;*/

    public ViewDTO view(String postNum) throws PostNotFoundException {
        Post post = postDAO.selectPost(postNum);
        //Shop shop = shopDAO.selectShop(post.getShareShop());

        ViewDTO viewDTO = new ViewDTO(post.getPostTitle(), post.getPostContent(), post.getShareMenu(),
                post.getShareTime(), post.getSharePlace(), post.getSharePeople(), post.getShareShop(), post.getTip());

        return viewDTO;
    }
}
