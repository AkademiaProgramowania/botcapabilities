package pl.akademiaprogramowania.botcapabilities.listener.impl;

import discord4j.core.event.domain.message.MessageCreateEvent;
import discord4j.core.object.entity.Message;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.akademiaprogramowania.botcapabilities.command.CommandRuleFactory;
import pl.akademiaprogramowania.botcapabilities.listener.EventListener;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class MessageCreateEventListenerImpl implements EventListener<MessageCreateEvent> {

    private final CommandRuleFactory commandRuleFactory;

    @Override
    public Class<MessageCreateEvent> getEventType() {
        return MessageCreateEvent.class;
    }

    @Override
    public Mono<Void> execute(MessageCreateEvent event) {
        return Mono.just(event.getMessage())
                .filter(message -> message.getAuthor().map(user -> !user.isBot()).orElse(false))
                .flatMap(Message::getChannel)
                .then();
    }
}