# Example Plugin for PowerNukkit
This is an example plugin which can also be used as template to start your own plugin.

As an example I created a plugin named clone-me, it creates a clone of yourself when you run `/clone`
and gives you a flower if you hit the clone and then despawn the clone. It also send some fancy messages.

These is enough to serve as an example on how to:
- Begin a new plugin
- Create event listeners and handlers
- Create custom commands
- Format text
- Spawn NPCs
- Despawn NPCs
- Detect attacks
- Make entities invulnerable
- Create and fill a `plugin.yml` file
- Debug your plugin properly

## Cloning and importing
1. Just do a normal `git clone https://github.com/PowerNukkit/ExamplePlugin.git` (or the URL of your own git repository)
2. Import the `build.gradle` file with your IDE, it should do the rest by itself

## Running
1. Just do a normal `git clone https://github.com/PowerNukkit/ExamplePlugin.git` (or the URL of your own git repository)
2. `cd ExamplePlugin` (or the name of your project)
3. `./gradlew run`

## Debugging
1. Import the project into your IDE
2. Make your IDE run the `debug` gradle task in debug mode

### Debuging using IntelliJ IDEA
Import the project and do this:  
![](https://i.imgur.com/eJxjEX0.png)
