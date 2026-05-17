# [swipe](/code/gestures/swipe.bsh)

Perform a swipe gesture through the accessibility gesture engine.

&nbsp;
# Dependencies
1. [gesture](/readme/gestures/gesture.md)

&nbsp;
# How it works
`swipe` builds a small gesture point sequence and delegates the motion to `gesture()`. It supports normalized coordinates (0.0-1.0) or absolute pixels. The `stopFlick` option holds the final position briefly to reduce momentum, and overloads provide convenient vertical center swipes.

&nbsp;
# How to use

**Swipe from one point to another:**
```
swipe(0.5, 0.8, 0.5, 0.2, 300);
```

&nbsp;
**Swipe and stop flick momentum:**
```
swipe(0.5, 0.8, 0.5, 0.2, 300, true);
```

&nbsp;
**Screen-center vertical swipe:**
```
swipe(0.8, 0.2);
```

&nbsp;
**Vertical swipe with custom duration:**
```
swipe(0.8, 0.2, 400);
```

&nbsp;
## Return Value
Returns `true` if the swipe gesture completed successfully, or `false` if dispatch failed.