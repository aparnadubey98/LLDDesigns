package splitwise.factory;

import splitwise.manager.EqualSplitManager;
import splitwise.manager.SplitManager;

public enum SplitManagerFactory {
    EQUAL {
        @Override
        public SplitManager createSplitManager() {
            return new EqualSplitManager();
        }
    };

    public abstract SplitManager createSplitManager() ;
}
