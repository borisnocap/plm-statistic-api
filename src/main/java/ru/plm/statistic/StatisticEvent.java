package ru.plm.statistic;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

public class StatisticEvent extends Event {

    private static final HandlerList handlers = new HandlerList();

    private final String playerName;
    private final String action;
    private final long counter;

    public StatisticEvent(@NotNull String playerName, @NotNull String action, long counter) {
        super();
        this.playerName = playerName;
        this.action = action;
        this.counter = counter;
    }

    public StatisticEvent(@NotNull String playerName, @NotNull String action) {
        this(playerName, action, 1);
    }

    public @NotNull HandlerList getHandlers() {
        return handlers;
    }

    public static @NotNull HandlerList getHandlerList() {
        return handlers;
    }

    public String getPlayerName() {
        return playerName;
    }

    public String getAction() {
        return action;
    }

    public long getCounter() {
        return counter;
    }
}
