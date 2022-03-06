package lab.zhang.risk.ast_compiler.router;

import lab.zhang.risk.ast_compiler.NestableData;
import lab.zhang.risk.ast_compiler.RoutableContext;
import lab.zhang.risk.ast_compiler.RoutableNode;
import lab.zhang.risk.ast_compiler.context.route.NestRouteContext;


/**
 * @author zhangrj
 */
public class NestRouter<S, V> extends BaseRouter<S, V> {

    @Override
    public RoutableContext<S, V> route(RoutableNode<S, V> node, RoutableContext<S, V> context) {
        return dfs(node, context);
    }


    @Override
    protected void travel(RoutableNode<S, V> node, RoutableContext<S, V> context) {
        if (context.isEmpty()) {
            return;
        }
        NestRouteContext<S, V> nestRouteContext = (NestRouteContext<S, V>) context;

        RoutableNode<S, V> parentStepNode = nestRouteContext.peekStep();
        S parentStep = null;
        if (parentStepNode.getData() != null && parentStepNode.getData().getStep() != null) {
            parentStep = parentStepNode.getData().getStep();
        }

        NestableData<S, V> data = node.getData();
        if (data != null) {
            data.setParent(parentStep);
        }
    }
}
