# [setDisplayId](/code/main/setDisplayId.bsh)

Set the global display ID for subsequent root and display operations.

&nbsp;
# Dependencies
None

&nbsp;
# How it works
`setDisplayId` writes the selected display ID to the global `DISPLAY_ID` variable. It also supports finding a display by name string and mapping that display's ID.

&nbsp;
# How it use

**Set display by numeric ID:**
```
setDisplayId(1);
```

&nbsp;
**Set display by name:**
```
displayId = setDisplayId("HDMI");
```

&nbsp;
## Return Value
Returns the selected display ID when using the named overload, or the numeric ID set.