# Assignment 3 - Bridge Pattern

- **Name:** Dias Salimzhan
- **Group:** SE-2522
- **Topic:** Option A (Drawing)
- **Repository URL:** https://github.com/DiasSalimzhan/Assignment3_BridgePattern
- **Base Commit Hash:** 3b2cc93
- **Submitted Commit Hash:** ea9a6fc

## Role Map
| Role | Class Name | Source Path |
|------|------------|-------------|
| Abstraction | Shape | src/Shape.java |
| A1 | Circle | src/Circle.java |
| A2 | Square | src/Square.java |
| Implementor | Renderer | src/Renderer.java |
| I1 | VectorRenderer | src/VectorRenderer.java |
| I2 | RasterRenderer | src/RasterRenderer.java |
| I3 | AsciiRenderer | src/AsciiRenderer.java |
| Client | Main | src/Main.java |

## Key Locations
- **Bridge Field:** `renderer` in `Shape.java`
- **execute():** in `Shape.java` (overridden in Circle & Square)
- **setImplementation(...):** in `Shape.java`
- **T5 Check:** `runT5()` in `Main.java`

## Build and Run Commands
```bash
javac --release 17 -encoding UTF-8 -d out "@sources.txt"
java -cp out Main