package lab.zhang.risk.ast_compiler.context.route;

import lab.zhang.risk.ast_compiler.RoutableContext;
import lab.zhang.risk.ast_compiler.RoutableNode;

import java.util.Iterator;
import java.util.Stack;


/**
 * @author zhangrj
 */
abstract public class RouteContext<S, V> implements RoutableContext<S, V> {

    protected Stack<RoutableNode<S, V>> pathStack = new Stack<>();


    public Iterator<RoutableNode<S, V>> iteratePath() {
        return pathStack.iterator();
    }


    @Override
    public boolean isEmpty() {
        return pathStack.isEmpty();
    }


    @Override
    public void pushStep(RoutableNode<S, V> node) {
        pathStack.push(node);
    }


    @Override
    public RoutableNode<S, V> popStep() {
        return pathStack.pop();
    }


    @Override
    public RoutableNode<S, V> peekStep() {
        return pathStack.peek();
    }
}
