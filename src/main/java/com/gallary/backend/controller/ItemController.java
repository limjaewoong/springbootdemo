package com.gallary.backend.controller;

import com.gallary.backend.entity.Item;
import com.gallary.backend.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ItemController {

    @Autowired
    ItemRepository itemRepository;

    @RequestMapping(value="/api/items",method = RequestMethod.GET)
    //@ResponseBody
    public List<Item> getItems(){

        List<Item> list = itemRepository.findAll();

        return list;
        /*List<String> items = new ArrayList<>();
        items.add("alpha");
        items.add("beta");
        items.add("gamma");

        return items;*/
    }
}
