package pl.akademiaprogramowania.botcapabilities.command.rule.impl;

import discord4j.core.object.entity.Message;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import pl.akademiaprogramowania.botcapabilities.command.rule.CommandRule;

@Component
public class CommandDinner implements CommandRule {

    private static final String DINNER = "!Dinner";

    @Override
    public boolean matches(Message message) {
        return message.getContent().equals(DINNER);
    }

    @Override
    public String apply(Message message) {
        return "Na obiadek proponuje schabowego";
    }
}
