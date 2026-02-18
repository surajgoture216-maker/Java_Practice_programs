public class Enums {

    // ✅ Define an enum with custom values for each constant
    public enum TrafficSignal {
        RED("Stop", 30),       // Pass String label and int duration
        GREEN("Go", 45),
        ORANGE("Caution", 5);

        // Fields to hold custom values
        private final String action;
        private final int durationInSeconds;

        // Private constructor called for each constant
        private TrafficSignal(String action, int durationInSeconds) {
            this.action = action;
            this.durationInSeconds = durationInSeconds;
        }

        // Public getters to access custom values
        public String getAction() {
            return action;
        }

        public int getDurationInSeconds() {
            return durationInSeconds;
        }

        // Optional: override toString() for more readable output
        @Override
        public String toString() {
            return name() + "(" + action + ", " + durationInSeconds + "s)";
        }

        // Optional: custom static lookup by action (reverse lookup)
        public static TrafficSignal valueOfAction(String action) {
            for (TrafficSignal sig : values()) {
                if (sig.action.equals(action)) {
                    return sig;
                }
            }
            return null; // or throw IllegalArgumentException
        }
    }

    public static void main(String[] args) {
        // Access and print custom values from each enum constant
        for (TrafficSignal ts : TrafficSignal.values()) {
            System.out.printf("%s: action='%s', duration=%d seconds%n",
                              ts.name(), ts.getAction(), ts.getDurationInSeconds());
        }

        // Use overridden toString()
        System.out.println("Custom toString(): " + TrafficSignal.RED);

        // Demonstrate reverse lookup by custom value
        String lookup = "Go";
        TrafficSignal result = TrafficSignal.valueOfAction(lookup);
        System.out.println("Lookup by action '" + lookup + "': " + result);
    }
}
