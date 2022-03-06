package lab.zhang.risk.ast_compiler.context.route;

import lab.zhang.risk.ast_compiler.NestableData;

import java.util.ArrayList;
import java.util.List;


/**
 * @author zhangrj
 */
public class PathRouteContext<S, V> extends RouteContext<S, V> {

    private final List<NestableData<S, V>> pathList = new ArrayList<>();


    public boolean write(NestableData<S, V> data, Object ext) {
        return pathList.add(data);
    }
}
