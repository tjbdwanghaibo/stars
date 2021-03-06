package com.stars.modules.base.condition.dataset.tool;

import com.stars.core.expr.node.dataset.ExprData;
import com.stars.core.module.Module;
import com.stars.modules.MConst;
import com.stars.modules.base.condition.dataset.BaseExprDataSet;
import com.stars.modules.tool.ToolModule;
import com.stars.modules.tool.userdata.RoleToolRow;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by zhaowenshuo on 2017/3/27.
 */
public class PcdsToolSet extends BaseExprDataSet {

    private Iterator<RoleToolRow> iterator;

    public PcdsToolSet() {
    }

    public PcdsToolSet(Map<String, Module> moduleMap) {
        super(moduleMap);
        ToolModule toolModule = module(MConst.Tool);
        iterator = toolModule.getItemMap().values().iterator();
    }

    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }

    @Override
    public ExprData next() {
        return new PcdsTool(iterator.next());
    }

    @Override
    public Set<String> fieldSet() {
        return PcdsTool.fieldSet();
    }
}
