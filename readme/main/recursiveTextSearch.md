# [recursiveTextSearch](/code/main/recursiveTextSearch.bsh)

Perform a manual recursive text search through the accessibility tree.

&nbsp;
# Dependencies
1. [getText](/readme/main/getText.md)

&nbsp;
# How it works
`recursiveTextSearch` traverses the tree manually and checks node text and content description case-insensitively. It is a fallback when system text search fails.

&nbsp;
# How it use

**Search for nodes containing text:**
```
results = recursiveTextSearch(getRoot(), "Submit");
```

&nbsp;
## Return Value
Returns an `ArrayList` of matching nodes, or an empty list if none are found.