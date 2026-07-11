# Obsidian Armor

Adds obsidian ingots that you smelt from obsidian blocks in a **blast furnace**, plus a full **obsidian armor set**. The armor set grants **Fire Resistance** while worn as a full set, but the weight **slows your movement** (Slowness). As a fun twist, both the ingot and every armor piece use the exact obsidian block texture, so everything looks like solid obsidian.

## How to use in-game
1. Put obsidian blocks in a **Blast Furnace** to smelt them into **Obsidian Ingots**.
2. Craft the helmet, chestplate, leggings, and boots at a crafting table just like any vanilla armor.
3. Wear **all four pieces** at once to get **Fire Resistance** — but expect to move slower.

## Building the mod (no Java install needed — GitHub builds it for FREE)

You do NOT need to install Java, Gradle, or anything on your computer. GitHub will build the `.jar` for you automatically.

### Step-by-step
1. **Create a GitHub account** at https://github.com (free).
2. Click the **+** in the top-right → **New repository**. Give it any name and click **Create repository**.
3. On the new repo page, click the link that says **"uploading an existing file"**.
4. **Extract** the downloaded zip of this project on your computer.
5. **IMPORTANT (macOS users):** the `.github` folder is **hidden by default** in Finder. Press **Cmd + Shift + .** (period) in Finder to reveal hidden files. If you skip this, the `.github` folder will NOT be uploaded, the build workflow will never run, and you will never get a `.jar`.
6. Open the extracted folder. Select **ALL files and folders from INSIDE it** — including the hidden `.github` folder. Do **NOT** drag the outer folder itself; drag its **contents**.
7. Drag all those selected files/folders into the GitHub upload page.
8. Scroll down and click **Commit changes**.
9. Click the **Actions** tab at the top of your repo. You'll see a build running.
10. Wait about **~2 minutes** for it to finish (green check mark).
11. Click the finished build run, scroll down to **Artifacts**, and download **mod-jar**.
12. Unzip it to get the `.jar`. Copy the `.jar` into your `.minecraft/mods/` folder (create the `mods` folder if it doesn't exist). You must have **Fabric Loader** and the **Fabric API** installed for Minecraft 1.20.1.

### Requirements to run
- Minecraft **1.20.1**
- **Fabric Loader** 0.15.11+
- **Fabric API** (0.92.2+1.20.1)

Enjoy your shiny (but heavy) obsidian armor!