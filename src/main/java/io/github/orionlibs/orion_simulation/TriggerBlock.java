package io.github.orionlibs.orion_simulation;

import io.github.orionlibs.orion_enumeration.OrionEnumeration;

/**
 * A block used to trigger an Atomic Subsystem or Model block.
 */
public class TriggerBlock extends Block
{
    private Object triggerSignal;
    private TriggerType triggerType;


    public enum TriggerType implements OrionEnumeration
    {
        RISING,
        FALLING,
        EITHER,
        FUNCTION_CALL;


        @Override
        public String get()
        {
            throw new UnsupportedOperationException();
        }


        @Override
        public boolean is(OrionEnumeration other)
        {
            return other instanceof TriggerType && this == other;
        }


        @Override
        public boolean isNot(OrionEnumeration other)
        {
            return other instanceof TriggerType && this != other;
        }


        public static boolean valueExists(String other)
        {
            TriggerType[] values = values();
            for(TriggerType value : values)
            {
                if(value.get().equals(other))
                {
                    return true;
                }
            }
            return false;
        }


        public static TriggerType getEnumForValue(String other)
        {
            TriggerType[] values = values();
            for(TriggerType value : values)
            {
                if(value.get().equals(other))
                {
                    return value;
                }
            }
            return null;
        }
    }
}
