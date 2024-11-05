package com.project.receiptCreator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.project.receiptCreator.model.Receipt;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
public class ReceiptController {

    private int numReceipts;

    @PostMapping("/getReceiptDetails")
    public String getReceiptDetails(@RequestParam("numReceipts") int numReceipts, Model model) {
        this.numReceipts = numReceipts;

        // Pass the number of receipts to the form page to dynamically create fields
        model.addAttribute("numReceipts", numReceipts);

        return "receiptForm";
    }

    @PostMapping("/generateReceipts")
    public String generateReceipts(
            @RequestParam List<String> date,
          //  @RequestParam List<String> time,
            @RequestParam List<String> area,
            @RequestParam List<Double> amount,
            Model model) {

        List<Receipt> receipts = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < numReceipts; i++) {
        	   // Generate a random time between 06:00 and 21:00
            int hour = 6 + random.nextInt(16); // 6 AM to 9 PM
            int minute = random.nextInt(60);
            LocalTime randomTime = LocalTime.of(hour, minute);
            // Generate random values for each receipt's additional fields
            Receipt receipt = new Receipt();
            receipt.setDate(date.get(i));
            receipt.setTime(randomTime.toString());
           // receipt.setTime(time.get(i));// at this time the user now wont enter time the time should come randomly from time morning 6 to night 9
            receipt.setArea(area.get(i));
            receipt.setAmount(amount.get(i));
            receipt.generateRandomDetails();
            receipts.add(receipt);
        }

        model.addAttribute("receipts", receipts);
        return "receiptOutput";
    }
}
