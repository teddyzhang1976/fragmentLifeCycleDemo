package com.watchman1976.pigmokey.mimi20171012.mimi.process;

import com.watchman1976.pigmokey.mimi20171012.mimi.input.IDecisionInput;
import com.watchman1976.pigmokey.mimi20171012.mimi.output.IDecisionOutput;

import java.util.ArrayList;

/**
 * Created by teddy on 2017/11/25.
 * 整个决策额过程的核心类，通过处理，学习输入总结归纳和决定输出
 * MIMI系统的核心类，决策过程类，通过DecisionIntentService向外部展示。
 */

public class DecisionProcess {
    private ArrayList<IDecisionInput> decisionInputs;
    private ArrayList<IDecisionOutput> decisionOutputs;//多个output好么？
}
