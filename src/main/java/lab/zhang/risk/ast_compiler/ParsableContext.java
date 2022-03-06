package lab.zhang.risk.ast_compiler;


/**
 * @author zhangrj
 */
public interface ParsableContext<S, V> {

    RoutableNode<S, V> getRootNode();

    RoutableNode<S, V> createNode(RoutableNode<S, V> parentNode, S index);
}
