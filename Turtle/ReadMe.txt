Explanation of the exercise:
The Turtle class defines a normal turtle for us. A turtle creation draws a turtle figure in the center of a graphics screen. The graphic screen was created with the creation of a turtle for the first time. The turtle has the ability to move. He can turn around himself to the right and left any full degree and turn in different directions. A turtle has a tail. The tail can be raised or lowered. If the tail is lowered and the turtle moves forward, the turtle leaves traces along its path in the form of a line on the graphic screen. If the tail is raised the turtle leaves no traces.

It is necessary to create several different types of turtles:
• Intelligent turtle (IntelligentTurtle) - An intelligent turtle is a regular turtle that, in addition, knows how to draw an elaborate polygon with a given number of sides and a given length.


• Drunk Turtle (DrunkTurtle) – A drunk turtle is a normal turtle that has had a little to drink and as a result it is a little difficult for him to walk. When he is asked to move forward x distance he performs the following actions one after the other in order (he performs them all every time he is asked to move forward):
o It moves a random distance between 0 and x.
o With a probability of 45% he turns 90 degrees to the right.
o With a 35% probability it will go back a random distance between 0 and x, otherwise it will go forward a random distance between 0 and x.

In addition, every time it is asked to make a turn at an angle y it will turn at a random angle between 0 and y1.5.

• Jumpy turtle (JumpyTurtle) - Jumpy turtle is an intelligent turtle that jumps: when its tail is lowered (draws) it alternates happily. The result is that when his tail is lowered, he leaves a dashed line, that is, when he was lowered and asked to walk, the result would be a broken line and not a smooth one. The queue will be structured so that a 4 pc long line appears each time and then a 4 pc distance without a line.

• Lazy turtle (LazyTurtle) - A lazy turtle is like a drunk turtle, but it will not always have the strength to perform the actions it is required to perform. Every time you ask him for something (he will do one of the following):
o With a 30% probability he will perform the action like a drunk turtle.
o With a probability of 20% he will perform the action like a simple turtle.
o With a 50% probability he will do nothing.
*Note - the probabilities are complementary, meaning that he is sure to perform one of the three actions.

• Burmese Turtle (BurmeseTurtle) - A Burmese turtle is like a smart turtle, but it is a less disciplined turtle and therefore does not perform certain actions as required. If we ask him to draw a polygon:
o With a 50% probability, he will draw a polygon with the side length you set, but with one side missing and disappear immediately after.
o With a 50% probability it will draw a polygon with the number of sides you set, but with a side length of 18 (regardless of the side length you set).
*Note - the probabilities are complementary, meaning that if he did not perform the first option, the turtle will perform the second option.

After creating the turtles, a program called Army.java is required to manage an army (array) of 5 turtles.
In the first stage, the user was allowed to choose the army of turtles as he wished. Show him the menu below and get his choice for each of the five turtles separately. Allow him to choose any mix of turtles. Below is the menu:
Choose the type of turtle:
1. Simple
2. Intelligent
3. Drunk
4. Jumpy
5. Lazy
6. Burmese
• In the second step, create the required turtles and advance them step by step over the following steps:
1. Histadrut Beshura (distance between Tzev and Tzev 120, when no signs remain while walking)
2. Lowering tail
3. Stepping forward for a distance of 65
4. A turn of 40 degrees to the left
5. Step forward for a distance of 75
6. Anyone who knows how to draw should draw a hexagon with a side of size 40.
7. The turtle maidens
At the end of the run, only the turtle drawings remain, without the turtles.
pay attention:
• The turtles must all move forward together. No turtle can move to a higher level before all other turtles have completed the previous level. The steps will start automatically after the user has selected the turtles. When the turtles act according to the order in which they were chosen.
• All the turtles go surely and straight to the initial location and only after organizing themselves do they start behaving according to their nature.