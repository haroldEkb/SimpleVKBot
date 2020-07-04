package com.harold.bot;

import com.harold.bot.entity.ConfirmationRequest;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author haroldekb@mail.ru
 **/

@RestController("/")
public class MainBotController {


    //Handle confirmation request for VK Callback API
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public String vkBotConfirmation(@RequestBody ConfirmationRequest request){
        if (request.getType().equals("confirmation") && Integer.parseInt(request.getGroup_id()) == 196557206) {
            return "c8369b34";
        }
        else return "";
    }
}
