package io.github.orionlibs.orion_simulation;

/**
 * Atomic Subsystem or Model block whose execution is controlled by an event from a
 * function-call initiator (such as a Stateflow chart or a Function-Call Generator,
 * S-Function, or Hit Crossing block). Contains a Trigger block with Trigger type set to function-call.
 */
public class FunctionCallAtomicSubsystemBlock extends AtomicSubsystemBlock
{
    private TriggerBlock triggerBlock;
}
