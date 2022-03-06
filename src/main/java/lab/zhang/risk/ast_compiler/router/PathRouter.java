package lab.zhang.risk.ast_compiler.router;

import lab.zhang.risk.ast_compiler.NestableData;
import lab.zhang.risk.ast_compiler.RoutableContext;
import lab.zhang.risk.ast_compiler.RoutableNode;
import lab.zhang.risk.ast_compiler.context.route.PathRouteContext;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/**
 * @author zhangrj
 */
public class PathRouter<S, V> extends BaseRouter<S, V> {

    @Override
    public RoutableContext<S, V> route(RoutableNode<S, V> node, RoutableContext<S, V> context) {
        return dfs(node, context);
    }


    @Override
    protected void travel(RoutableNode<S, V> node, RoutableContext<S, V> context) {
        if (context.isEmpty()) {
            return;
        }
        PathRouteContext<S, V> pathRouteContext = (PathRouteContext<S, V>) context;

        // build the path
        List<S> stepList = new ArrayList<>();
        Iterator<RoutableNode<S, V>> pathIter = pathRouteContext.iteratePath();
        while (pathIter.hasNext()) {
            RoutableNode<S, V> parentStepNode = pathIter.next();
            S parentStep = null;
            if (parentStepNode.getData() != null && parentStepNode.getData().getStep() != null) {
                parentStep = parentStepNode.getData().getStep();
            }
            stepList.add(parentStep);
        }

        // ignore the dummy node
        if (stepList.size() > 0) {
            stepList.remove(0);
        }

        // add to the tail of the path
        NestableData<S, V> data = node.getData();
        if (data == null) {
            return;
        }
        stepList.add(data.getStep());

        // set path
        data.setPath(stepList);

        if (pathRouteContext.write(data, null)) {
            throw new RuntimeException("PathRouter.travel.write failed");
        }
    }
}
