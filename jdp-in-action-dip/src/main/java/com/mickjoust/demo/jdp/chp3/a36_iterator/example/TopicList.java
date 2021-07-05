package com.mickjoust.demo.jdp.chp3.a36_iterator.example;

/**
 * @author mickjoust
 */
public class TopicList implements ListList<Topic>{

    private Topic[] topics;

    public TopicList(Topic[] topics)
    {
        this.topics = topics;
    }

    @Override
    public IteratorIterator<Topic> iterator() {
        return new TopicIterator(topics);
    }
}
