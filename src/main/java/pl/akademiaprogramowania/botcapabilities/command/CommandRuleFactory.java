package pl.akademiaprogramowania.botcapabilities.command;

import discord4j.core.object.entity.Message;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import pl.akademiaprogramowania.botcapabilities.command.rule.CommandRule;
import pl.akademiaprogramowania.botcapabilities.exception.RuleNotSupportedException;

import java.util.List;

@Component
@RequiredArgsConstructor
public class CommandRuleFactory {

    private final List<CommandRule> rules;

    public CommandRule getCommandRule(Message message) {
        return rules.stream()
                .filter(commandRule -> commandRule.matches(message))
                .findFirst()
                .orElseThrow(() -> new RuleNotSupportedException(message.getContent()));
    }
}
