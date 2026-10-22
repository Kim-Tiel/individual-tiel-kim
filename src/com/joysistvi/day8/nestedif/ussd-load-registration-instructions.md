# Activity: USSD Load Registration Simulator (Java Console)

## Overview

In this activity, you will build a Java console application that simulates a mobile network's USSD menu for registering data promos. The user dials a USSD code, navigates through nested menus, and subscribes to a promo.

This activity practices **user input handling, nested menus, loops, conditionals, and method organization**.

---

## Requirements

### 1. Dial the USSD Code

The program starts by asking the user to dial the USSD code.

- Display: `Dial *143# to access Globe Services`
- Prompt: `Enter USSD Code: `
- Only `*143#` is accepted. Any other code should display an error message and ask again.

### 2. Main Menu: Load Registration

After a valid code, display the main menu:

```
* Load Registration *
[1] Go+
[2] Go
[3] GoEXTRA
[4] UNLI 5G
[5] ALLNET
Enter a choice:
```

### 3. Promo Menus (Sub-menus)

**Every** main menu option must open its own promo list. All five sub-menus are required:

```
*** Go+ Promos ***
[1] Go+99
[2] Go+129
[3] Go+149
Enter a choice:
```

```
*** Go Promos ***
[1] Go50
[2] Go90
[3] Go120
Enter a choice:
```

```
*** GoEXTRA Promos ***
[1] GoEXTRA99
[2] GoEXTRA129
[3] GoEXTRA149
Enter a choice:
```

```
*** UNLI 5G Promos ***
[1] UNLI 5G 99
[2] UNLI 5G 149
[3] UNLI 5G 199
Enter a choice:
```

```
*** ALLNET Promos ***
[1] ALLNET99
[2] ALLNET149
[3] ALLNET199
Enter a choice:
```

### 4. Promo Details Menu

Selecting a promo shows its details and the action menu. The format is the same for every promo:

```
*** Go+99 Promo ***
-> Get 8 GB for all sites + 8GB
[1] Subscribe
[2] Exit
Enter a choice:
```

| Choice | Behavior |
|--------|----------|
| `1` Subscribe | Shows `You are now subscribed to <promo name>` and ends the program |
| `2` Exit | Ends the program immediately |

---

## Sample Run

```
Dial *143# to access Globe Services
Enter USSD Code: *143#

        * Load Registration *
    [1] Go+
    [2] Go
    [3] GoEXTRA
    [4] UNLI 5G
    [5] ALLNET
Enter a choice: 1

        *** Go+ Promos ***
    [1] Go+99
    [2] Go+129
    [3] Go+149
Enter a choice: 1

        *** Go+99 Promo ***
-> Get 8 GB for all sites + 8GB
    [1] Subscribe
    [2] Exit
Enter a choice: 1

You are now subscribed to Go+99
```
