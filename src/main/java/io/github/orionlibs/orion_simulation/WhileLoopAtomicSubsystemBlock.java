package io.github.orionlibs.orion_simulation;

/**
 * Atomic Subsystem block that runs multiple iterations during each model time step.
 * Contains a While Iterator block that controls the number of iterations by evaluating a logical condition.
 * A while iterator subsystem is similar to a function-call subsystem in that it can run for
 * any number of iterations at a given time step. The while iterator subsystem differs
 * from a function-call subsystem in that there is no separate initiator.
 */
public class WhileLoopAtomicSubsystemBlock extends AtomicSubsystemBlock
{
    private WhileLoopBlock whileLoopBlock;
}
