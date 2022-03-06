package lab.zhang.risk.ast_compiler;

public interface RoutableContext<S, V> {

    boolean isEmpty();

    void pushStep(RoutableNode<S, V> node);

    RoutableNode<S, V> popStep();

    RoutableNode<S, V> peekStep();
}
