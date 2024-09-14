package com.example.tazameken.service.impl;

import com.example.tazameken.dto.BidCreateDto;
import com.example.tazameken.dto.BidDto;
import com.example.tazameken.model.Bid;
import com.example.tazameken.repository.BidRepository;
import com.example.tazameken.service.BidService;
import com.example.tazameken.util.FileUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BidServiceImpl implements BidService {
    private final BidRepository bidRepository;
    private final FileUtil fileUtil;

    @Override
    public BidDto createBid(BidCreateDto bidCreateDto) {
        String photo = fileUtil.saveUploadedFile(bidCreateDto.getPhoto(), "/images");
        Bid bid = Bid.builder()
                .latitude(bidCreateDto.getLatitude())
                .longitude(bidCreateDto.getLongitude())
                .altitude(bidCreateDto.getAltitude())
                .photoName(photo)
                .build();
        return buildDto(bidRepository.save(bid));
    }

    private BidDto buildDto(Bid bid) {
        return BidDto.builder()
                .latitude(bid.getLatitude())
                .longitude(bid.getLongitude())
                .altitude(bid.getAltitude())
                .photo(bid.getPhotoName())
                .build();
    }
}
