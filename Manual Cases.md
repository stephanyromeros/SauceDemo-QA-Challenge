# Manual Test Cases (SauceDemo E-commerce Flow)

## User Story
As a registered user, I want to log in to SauceDemo, filter products, select one, and complete the checkout process so I can easily purchase items and verify that the e-commerce flow works correctly.

---

### TC-001: Successful Login (Base Positive Case)

* **TC ID:** `TC-001-LOGIN-VALID`
* **Title:** Verification of Successful Access with Valid Credentials.
* **Preconditions:**
    * A valid user ("standard_user") and password ("secret_sauce") are available.
* **Steps:**
    1.  Navigate to the SauceDemo login page.
    2.  Enter username "standard_user" and password "secret_sauce".
    3.  Click the Login button.
* **Expected Result:**
    * The user is redirected to the Products page (`/inventory.html`).
    * The page title "Products" is visible.

---

### TC-002: Failed Login (Negative Scenario: Locked User)

* **TC ID:** `TC-002-LOGIN-LOCKED`
* **Title:** Verification of Error Message for Locked-Out User.
* **Preconditions:**
    * A locked-out user ("locked_out_user") exists in the system.
* **Steps:**
    1.  Navigate to the SauceDemo login page.
    2.  Enter username "locked_out_user" and password "secret_sauce".
    3.  Click the Login button.
* **Expected Result:**
    * The user remains on the login page.
    * The error message is displayed: "Epic sadface: Sorry, this user has been locked out."

---

### TC-003: Failed Checkout (Negative Scenario: Empty Fields)

* **TC ID:** `TC-003-CHECKOUT-EMPTY`
* **Title:** Validation Error When Attempting to Continue Checkout Without First Name.
* **Preconditions:**
    * User "standard_user" is logged in and has added at least one product to the cart.
* **Steps:**
    1.  Go to the cart page and click Checkout.
    2.  Leave the First Name field empty.
    3.  Enter "User" in the Last Name field.
    4.  Enter "12345" in the Zip/Postal Code field.
    5.  Click Continue.
* **Expected Result:**
    * The user remains on the checkout information page.
    * An error message is displayed containing: "Error: First Name is required"

---

### TC-004: Product Filter Verification (Positive)

* **TC ID:** `TC-004-FILTER-ZTOA`
* **Title:** Verification of Product Sorting from Z to A.
* **Preconditions:**
    * User "standard_user" is logged in and on the Products page.
* **Steps:**
    1.  Click the filter dropdown.
    2.  Select "Name (Z to A)".
    3.  Verify the name of the first product in the list.
    4.  Verify the name of the last product in the list.
* **Expected Result:**
    * The first product should be the one starting with the letter closest to Z (e.g., "Test.allTheThings() T-Shirt (Red)").
    * The product list is sorted alphabetically in descending order (Z–A).

---

### TC-005: Remove Product from Cart (Secondary Positive Flow)

* **TC ID:** `TC-005-CART-REMOVE`
* **Title:** Verification of the "Remove" Product Functionality.
* **Preconditions:**
    * User "standard_user" is logged in.
    * The product "Sauce Labs Bike Light" has been added to the cart.
* **Steps:**
    1.  Click the shopping cart icon.
    2.  Locate the product "Sauce Labs Bike Light".
    3.  Click the Remove button associated with the product.
    4.  Check the cart icon.
* **Expected Result:**
    * The product "Sauce Labs Bike Light" is removed from the cart list.
    * The cart counter (next to the icon) updates to 0.

---

### TC-006: Successful Purchase Flow and Completion

* **TC ID:** `TC-006-PURCHASE-SUCCESS`
* **Title:** Complete Purchase Flow and Successful Completion.
* **Preconditions:**
    * Test case **TC-001: Successful Login** has been executed (user logged in and on the Products page).
* **Steps:**
    1.  Select the sorting filter "Price (low to high)".
    2.  Click ADD TO CART for the product "Sauce Labs Backpack".
    3.  Click the shopping cart icon.
    4.  Click Checkout.
    5.  Enter "Test" in the First Name field.
    6.  Enter "User" in the Last Name field.
    7.  Enter "12345" in the Zip/Postal Code field.
    8.  Click Continue.
    9.  Click Finish.
* **Expected Result:**
    * The user is redirected to the "Checkout: Complete!" page.
    * The confirmation message is displayed: "Thank you for your order!"
