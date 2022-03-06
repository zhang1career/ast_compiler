package lab.zhang.risk.ast_compiler;


/**
 * @author zhangrj
 */
public interface Routable<S, V> {
    RoutableContext<S, V> route(RoutableNode<S, V> node, RoutableContext<S, V> context);
}
