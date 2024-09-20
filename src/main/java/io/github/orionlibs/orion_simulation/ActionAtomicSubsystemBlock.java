package io.github.orionlibs.orion_simulation;

/**
 * Atomic Subsystem block whose execution is controlled by an event from an action initiator
 * (e.g., If or Switch Case block). Contains an Action Port block within the Subsystem block.
 */
public class ActionAtomicSubsystemBlock extends AtomicSubsystemBlock
{
    private Object actionSignal;
}
