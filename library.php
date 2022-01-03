<?php

// allow debugging
error_reporting(E_ALL);
ini_set('display_errors', 1);


define('IS_SAFE', true);

$title ='Output the books in a library as a table'; 
$footer = 'The age footer'; 

// output the page head
require 'library-head.php';

echo "<h1>$title</h1>";
echo "<p>Create an array to start with:</p>";

$books = [
    "Milner" => "Winnnie-The-Pooh",
    "Proysen" => "Mrs Pepperpot Stories ",
    "Uttley" => "A Traveller in Time",
    "Sewell" => "Black Beauty",
    "Frank" => "The Diary of a Young Girl ",
    "De Saint-Exupery" => "The Little Prince",
    "Ransome" => "Swallows and Amazons", 
    "Hines" => "A Kestrel for a Knave",
];

// sort the array "naturally" by value
natcasesort($books);
?>

<pre>$books = <?php var_export($books) ?></pre>

<p>Output a table with key and value columns:</p>

<table border="1">
    <caption>Books</caption>
    <tr>
        <th>key</th>
        <th>value</th>
    </tr>
    <?php foreach ($books as $key => $value) { ?>
        <tr>
            <td><?php echo htmlspecialchars($key) ?></td>
            <td><?php echo htmlspecialchars($value) ?></td>
        </tr>
    <?php } ?>
</table>

<p>Output a table with a column per key:</p>

<table border="2">
    <caption>Books</caption>
    <tr>
        <?php foreach ($books as $key => $value) { ?>
            <th><?php echo htmlspecialchars($key) ?></th>
        <?php } ?>
    </tr>
    <tr>
        <?php foreach ($books as $key => $value) { ?>
            <td><?php echo htmlspecialchars($value) ?></td>
        <?php } ?>
    </tr>
</table>

<?php
// output the page foot
require 'library-foot.php';
?>
