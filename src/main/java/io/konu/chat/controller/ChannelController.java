package io.konu.chat.controller;

import com.google.common.collect.Lists;
import io.konu.chat.model.avro.Message;
import org.joda.time.DateTime;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
public class ChannelController {

    @RequestMapping("/channel/{id}/message")
    public List<Message> getMessages(@PathParam(value="id") String id) {
        Message m1 = Message.newBuilder().setAuthor("michael")
                .setCreatedDate(DateTime.now())
                .setText("test message 1, channel= " + id)
                .setTtl(11)
                .setId("1")
                .build();
        Message m2 = Message.newBuilder().setAuthor("michael")
                .setCreatedDate(DateTime.now())
                .setText("test message 2, channel= " + id)
                .setTtl(11)
                .setId("2")
                .build();
        Message m3 = Message.newBuilder().setAuthor("michael")
                .setCreatedDate(DateTime.now())
                .setText("test message 3, channel= " + id)
                .setTtl(11)
                .setId("3")
                .build();
        return Lists.newArrayList(m1, m2, m3);
    }

}
