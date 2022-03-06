package lab.zhang.risk.ast_compiler.router;

import lab.zhang.risk.ast_compiler.Routable;
import lab.zhang.risk.ast_compiler.RoutableNode;
import lab.zhang.risk.ast_compiler.RoutableContext;
import lombok.Data;


@Data
abstract public class BaseRouter<S, V> implements Routable<S, V> {

    protected RoutableContext<S, V> dfs(RoutableNode<S, V> node, RoutableContext<S, V> context) {
        travel(node, context);

        if (node.isLeaf()) {
            return endTravel(node, context);
        }

        for (RoutableNode<S, V> child : node.getChildValueList()) {
            preTravel(node, context);
            dfs(child, context);
            postTravel(node, context);
        }

        return endTravel(node, context);
    }

    protected void preTravel(RoutableNode<S, V> node, RoutableContext<S, V> context) {
        context.pushStep(node);
    }

    protected void postTravel(RoutableNode<S, V> node, RoutableContext<S, V> context) {
        context.popStep();
    }

    protected RoutableContext<S, V> endTravel(RoutableNode<S, V> node, RoutableContext<S, V> context) {
        return context;
    }

    abstract protected void travel(RoutableNode<S, V> node, RoutableContext<S, V> context);
}
