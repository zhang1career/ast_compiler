package lab.zhang.risk.ast_compiler;


/**
 * @author zhangrj
 */
public interface ParsableContext<S, V> {

    lab.zhang.risk.ast_compiler.RoutableNode<S, V> getRootNode();

    lab.zhang.risk.ast_compiler.RoutableNode<S, V> createNode(lab.zhang.risk.ast_compiler.RoutableNode<S, V> parentNode, S index);
}
