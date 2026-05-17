# [findRelevantNodesForClear](/code/actions/findRelevantNodesForClear.BSH)

Internal helper to locate nodes with focus or selection state.

&nbsp;
# Dependencies
1. [getRoot](/readme/main/getRoot.md)

&nbsp;
# How it works
`findRelevantNodesForClear` crawls the active root node tree and collects nodes that match a specified state such as `clearFocus`, `clearSelection`, or `clearA11yFocus`. It is intended for internal use by focus-clearing helpers.

&nbsp;
# How to use

**Internal helper usage:**
```
findRelevantNodesForClear("clearFocus");
```

&nbsp;
## Return Value
Returns an `ArrayList` of nodes matching the requested state.