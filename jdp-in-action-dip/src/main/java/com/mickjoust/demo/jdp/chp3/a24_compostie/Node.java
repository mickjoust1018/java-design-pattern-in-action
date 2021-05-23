package com.mickjoust.demo.jdp.chp3.a24_compostie;

import java.util.List;

/**
 * @author mickjoust
 **/
public class Node extends Component {

    private List<Component> myChildren;

    @Override
    public void operation() {
        for (Component component: myChildren) {
            component.operation();
        }
    }

}
