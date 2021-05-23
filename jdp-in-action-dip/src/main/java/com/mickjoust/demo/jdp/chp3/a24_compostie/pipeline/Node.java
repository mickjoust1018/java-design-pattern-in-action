package com.mickjoust.demo.jdp.chp3.a24_compostie.pipeline;

/**
 * @author mickjoust
 **/
public class Node implements PipelineNode {

    private PipelineNode child;

    @Override
    public PipelineNode getNext() {
        return child;
    }

}
