package edu.zjnu.event.demo.event;

import edu.zjnu.event.demo.event.AbstractContextEvent;

/**
 * @description: ContextStartEvent
 * @author: 杨海波
 * @date: 2022-03-28 14:05
 **/
public class ContextStartEvent extends AbstractContextEvent {
    private static final long serialVersionUID = -61593910395467838L;

    private long timestamp;

    private final Object source;

    public ContextStartEvent(Object source) {
        this.timestamp = System.currentTimeMillis();
        this.source = source;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public Object getSource() {
        return source;
    }
}
