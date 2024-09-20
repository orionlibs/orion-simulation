package io.github.orionlibs.orion_simulation;

/**
 * Atomic Subsystem or Model block whose execution is controlled by external data from a signal.
 * Contains an Enable or Trigger block, or both. For the Trigger block,
 * the parameter Trigger type is set to rising, falling, or either
 */
public class EnabledTriggeredAtomicSubsystemBlock extends AtomicSubsystemBlock
{
    private boolean isEnabled;
    private boolean isTriggered;
    private EnableBlock enableBlock;
    private TriggerBlock triggerBlock;
}
