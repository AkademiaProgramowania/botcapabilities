1. Uzyj naszej implementacji wzorcow rules engine pattern + factory. Musisz jedynie dopisac metode
   ".flatMap(TUTAJ_UŻYJ_WZORCA_PROJEKTOWEGO)" zaraz po ".flatMap(Message::getChannel)".
2. Stwórz klase DiscordPropertiesConfig która będzie posiadała zmienne zaciagane z application.yml i uzyj
   DiscordPropertiesConfig do pobrania tokena w BotConfiguration zamiast tego co jest
3. Utwórz funkcjonalność do wysyłania prywatnej wiadomości powitalnej każdemu nowemu użytkownikowi. Tresc wiadomosci
   to „Cześć name:D Witaj na serwerze” gdzie name ma zostac zamienione na discordowy username
4. Przerob MessageCreateEventListenerImpl i implementacje wzorca rules engine pattern tak zeby obslugiwal komendy
   - !addMeeting name yyyy-MM-dd HH:mm description (dodanie spotkania o podanych wlasciwosciach do bazy danych mysql)
   - !deleteMeeting name (usuniecie spotkania o podanej nazwie z bazy danych mysql)
5. Utwórz funkcjonalność do wysyłania zaplanowanej wiadomości w kazda niedziele o 9;00. Wiadomosc ma zawierac
   plik pdf w ktorym znajduja sie wszystkie spotkania zaplanowane na najblizszy tydzien