package pl.akademiaprogramowania.botcapabilities.command.rule.impl;

import discord4j.core.object.entity.Message;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import pl.akademiaprogramowania.botcapabilities.command.rule.CommandRule;

@Component
public class CommandBreakfast implements CommandRule {

    private static final String BREAKFAST = "!Breakfast";

    @Override
    public boolean matches(Message message) {
        return message.getContent().equals(BREAKFAST);
    }

    @Override
    public String apply(Message message) {
        return "Na sniadanko proponuje jajecznice";
    }
}
