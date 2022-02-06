package com.bulyginkonstantin.friend_app.controllers;

import com.bulyginkonstantin.friend_app.data.Client;
import com.bulyginkonstantin.friend_app.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ShowFriendController {

    @Autowired
    ClientRepository clientRepository;

    @GetMapping("/showFriends")
    public String showFriends(Model model) {
        List<Client> friends = clientRepository.findAll();
        model.addAttribute("friendsList", friends);
        return "friends";
    }

}
