# CSC360 JavaFX and EventDrivenProgramming
 
Create a graphical user interface program for solving the quadratic equation ax2 + bx + c = 0. The user
will enter values for a, b, and c into text fields and press a “Solve” button. The program will then display
a list of the roots in a text field.

Your interface should look similar to the above. Use a BorderPane as the parent node of the scene. Use
an HBox to hold the four labels and four text fields and another HBox to hold the “Solve” button. The
unicode for a superscripted 2 is “\u00B2”. Recall from the ShowGridPane example in Section 14.10.1
that you can modify the width of a text field by calling setPrefColumnCount.

When the user clicks the “Solve” button the program should use Double.parseDouble to parse the a, b,
and c text fields. If any of these calls to parseDouble cause an exception then catch the exception and
change that text field’s text to “0” (by performing setText("0") on that text field). Do not change
the values in the other text fields.

Your program should correctly deal with cases where a, b, and/or c are 0 –

If all three fields are 0 then the roots are all x
If a and b are 0 but c is non-zero, then there are no roots
If a is 0 but b is non-zero, then we have a line with non-zero slope, so there is exactly one root
If a is non-zero, then the number of roots depends on the so-called discriminant: b2 – 4ac. 
        If the discriminant is positive, there are two roots.  
        If the discriminant is 0, there is only one root 
        If the discriminant is negative, then there are no roots